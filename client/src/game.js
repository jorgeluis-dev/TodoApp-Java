import Phaser from 'phaser';

const config = {
  type: Phaser.AUTO,
  width: 800,
  height: 600,
  scene: { preload, create, update }
};

// Lógica do jogo Phaser aqui