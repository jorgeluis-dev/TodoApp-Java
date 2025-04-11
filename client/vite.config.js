import { defineConfig } from 'vite'

export default defineConfig({
  build: {
    outDir: '../server/public', // A build será enviada para o servidor
    emptyOutDir: true,
  },
  publicDir: 'public', // Pasta de assets estáticos
})