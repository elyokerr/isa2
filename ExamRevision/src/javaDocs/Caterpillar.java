package javaDocs;

public class Caterpillar {
	
		 private int moves;
		 private int cabbages_eaten;
		 public Caterpillar(int moves, int eaten)
		 {
		 this.setMoves(moves);
		 this.setCabbages_eaten(eaten);
		 }
		 int getMoves() {
		 return moves;
		 }
		 void setMoves(int moves) {
		 this.moves = moves;
		 }
		 int getCabbages_eaten() {
		 return cabbages_eaten;
		 }
		 void setCabbages_eaten(int cabbages_eaten) {
		 this.cabbages_eaten = cabbages_eaten;
		 }
		 void move()
		 {
		 setMoves(getMoves() + 1);
		 }
		 void eat()
		 {
		 this.setCabbages_eaten(this.getCabbages_eaten() + 1);
		 }
		 void display()
		 {
		 System.out.println("Moves made =" + getMoves());
		 System.out.println("Cabbages eaten =" + getCabbages_eaten());
		 }
		public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 Caterpillar fred = new Caterpillar(0,0);
		 fred.move();
		 fred.eat();
		 fred.display();
		 }
	

}
