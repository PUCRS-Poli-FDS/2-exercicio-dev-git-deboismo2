/*Bruno Motta, Nathan Kruger e Jonathan Roc
classe Mars Rover
*/
public class MR{
    public static final Integer N = 1;
    public static final Integer E = 2;
    public static final Integer S = 3;
    public static final Integer W = 4;
    Integer x = 0;
    Integer y = 0;
    Integer pos = N;
    public MR() {
    }
    public void setPosicao (Integer x, Integer y, Integer facing) {
        this.x = x;
        this.y = y;
        this.pos = pos;
    }
    public void printPosicao() {
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
        System.out.println(x + " "  +  y  + " "  + direcao);
    }
    public void processa (String comandos) {
        for (int idx = 0; idx < comandos.length(); idx++) {
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
            throw new IllegalArgumentException("Caracter não aceito!");
        }
    }
    
    private void mover() {
		if (pos == N) {
			this.y  ;
		} else if (pos == E) {
			this.x  ;
		} else if (pos == S) {
			this.y--;
		} else if (pos == W) {
			this.x--;
		}
	}
	private void virarEsquerda() {
		pos = (pos - 1) < N ? W : pos - 1;
	}
	private void virarDireita() {
		pos = (pos   1) > W ? N : pos   1;
	}
	public static void main(String args[]) {
		MR mr = new MR();
		rover.setPosicao(1, 2, N);
		rover.processa("LMLMLMLMM");
		rover.printPosicao(); // prints 1 3 N
		rover.setPosicao(3, 3, E);
		rover.process(a"MMRMMRMRRM");
		rover.printPosicao(); // prints 5 1 E
	}
}
}