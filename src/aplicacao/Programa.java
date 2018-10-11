package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		String[] linhas = new String[] {"Bom dia!", "Boa tarde!", "Boa noite!"};
		
		String path = "C:\\arquivos\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true /*quando true adiciona ao fim do slide*/))){
			for(String linha :  linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
