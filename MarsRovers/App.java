/*Bruno Motta, Nathan Kruger e Jonathan Roc
classe App
*/
public class App{
    public static void main(String args[]) {
		MR mr = new MR(0,0,W);
		mr.setPosicao(1, 2, N);
		mr.processa("LMLMLMLMM");
		mr.printPosicao(); // prints 1 3 N
		mr.setPosicao(3, 3, E);
		mr.processa("MMRMMRMRRM");
		mr.printPosicao(); // prints 5 1 E
	}
}