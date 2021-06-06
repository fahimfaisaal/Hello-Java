package Generics;

public class Generics<T> {
	public T object;

	public Generics(T object) {
		this.object = object;
	}

	public T getGen() {
		return this.object;
	}
}
