package serilizable;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class B extends SerilizableJava {
	int j;

	public B(int a, int b) {
		super(5, 10);
		this.j = b;
	}

	private void writeObject(ObjectOutputStream obj) throws IOException {
		throw new NotSerializableException();
	}

	private void readObject(ObjectInputStream in) throws IOException {
		throw new NotSerializableException();
	}

}
