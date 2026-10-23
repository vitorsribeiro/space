package br.com.joaocarloslima;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
    }

    public Tiro atirar(int poder) {
        return new Tiro(getX(), getY(), 10, Direcao.CIMA, poder);
    }

    @Override
    public void mover() {
        super.mover();
        if (getX() < 0) {
            setX(0);
        }
        if (getX() > 640 - 50) {
            setX(640 - 50);
        }
    }
}
