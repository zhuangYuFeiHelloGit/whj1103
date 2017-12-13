package com.lanou3g.study;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by zyf on 2017/12/12.
 */
public class SerializableDemo {

	@Test
	public void output() throws IOException {

		Pet pet = new Pet("雪纳瑞","male");

		FileOutputStream fos =
				new FileOutputStream("src/pet.out");

		ObjectOutputStream
				oos = new ObjectOutputStream(fos);


		oos.writeObject(pet);


		oos.flush();

		oos.close();


	}


}
