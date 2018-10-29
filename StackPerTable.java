public class StackPerTable extends Table implements Stack {
	
	public StackPerTable(int size) { super(size); }

	public boolean stackEmpty() {
		return (this.position == 0);
	}

	public boolean stackFull() {
		return (this.position == this.tab.length);
	}

	public Integer pop() {
		Integer result = null;

		if (!stackEmpty()) {
			this.position--;
			result = this.tab[this.position];
		}

		return result;
	} 

	public void push(Integer obj) {
		if (!stackFull()) {
			this.tab[this.position] = obj;
			this.position++;
		}
	}
}