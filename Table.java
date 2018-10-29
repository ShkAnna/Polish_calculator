public abstract class Table {

	Integer tab[];
	int position;

	public Table(int size) {
	this.tab = new Integer[size];
	this.position = 0;
	}
}