# Usa a imagem do Node.js
FROM node:18-alpine

# Cria diretório de trabalho
WORKDIR /app

# Copia os arquivos de dependências
COPY package*.json ./
COPY client/package*.json ./client/
COPY server/package*.json ./server/

# Instala dependências
RUN npm ci --prefix server && npm ci --prefix client

# Copia todo o código
COPY . .

# Constrói o cliente (se necessário)
RUN npm run build --prefix client

# Portas expostas
EXPOSE 3000 2567

# Comando para iniciar o servidor
CMD ["npm", "start", "--prefix", "server"]