package gorevSerialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Modelim;

public class GorevSerializer {
private static final String DATA_PATH="data.bin";

public static void serialize(Object[] gorevler) throws IOException {
	try(var serializer=new ObjectOutputStream(new FileOutputStream(DATA_PATH))){
		serializer.writeObject(gorevler);
	}
}
	
public static Modelim[] deserialize() throws IOException,ClassNotFoundException{
	try(var deseralizer= new ObjectInputStream(new FileInputStream(DATA_PATH)) ){
		Object[] gorev=(Object[]) deseralizer.readObject();
		Modelim[] dizim=new Modelim[gorev.length];
		for(int i=0;i<gorev.length;i++) {
			dizim[i]=(Modelim)gorev[i];
		}
		return dizim;
	}
}


}
