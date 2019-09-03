/*Bruno Motta, Nathan Kruger e Guilherme Zago
classe Mars Rover
*/
public class MR{
    public static final Integer N = 1;
    public static final Integer E = 2;
    public static final Integer S = 3;
    public static final Integer W = 4;
    Integer x = 0;
    Integer y = 0;
    Integer facing = N;
    public Rover() {
    }
    public void setPosicao (Integer x, Integer y, Integer facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }
    public void printPosicao) {
        char direcao = 'N';
        if (pos == 1) {
            direcao = 'N';
        } else if (pos == 2) {
            direcao = 'E';
        } else if (pos == 3) {
            direcao = 'S';
        } else if (pos == 4) {
            direcao = 'W';
        }
        System.out.println(x   " "   y   " "   direcao);
    }
    public void processa (String comandos) {
        for (int idx = 0; idx < comandos.length(); idx  ) {
            process(comandos.charAt(idx));
        }
    }
    private void processa(Character comando) {
        if (comando.equals('L')) {
            virarEsquerda();
        } else if (comando.equals('R')) {
            virarDireita();
        } else if (comando.equals('M')) {
            mover();
        } else {
            throw new IllegalArgumentException(
                    "Caracter não aceito!");
        }
    }
}