package myproject.demo.test;

import java.io.Serializable;

public class Gem<T, S, G> implements Serializable {
	private T t;
	private S s;
	private G g;

	public Gem(T t, S s, G g) {
		this.t = t;
		this.s = s;
		this.g = g;
	}

	public Gem() {

	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public S getS() {
		return s;
	}

	public void setS(S s) {
		this.s = s;
	}

	public G getG() {
		return g;
	}

	public void setG(G g) {
		this.g = g;
	}

}
