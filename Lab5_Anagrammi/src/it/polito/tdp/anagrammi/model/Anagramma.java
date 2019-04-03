package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.Dao.AnagrammaDAO;

public class Anagramma {

	List<String> listaAnagrammi=new ArrayList();
	public List<String> Anagramma(String parola){
		listaAnagrammi=new ArrayList<String>();
		String parolaparziale="";
		ricorsivoanagrammi(parola,parolaparziale,0);
		 return listaAnagrammi;
		
		
	}
	
	public  void  ricorsivoanagrammi(String parola,String parolaparziale,int livello){
		char lettere[];
		lettere=parola.toCharArray();
		int i=parola.length();
		
		
		
		//terminazione quando la parola parziale.size è uguale alla 
		//parola inziale da anagrammare
		if(livello==parola.length()) {
			listaAnagrammi.add(parolaparziale);
			
		}
		
		
		
		
		
		
		for(char c:lettere) {
			
			
			//controllo per vedere se ho già usato la lettera,se non la cotiene genero la soluzione
			if(parolaparziale.contains(""+c)==false) {
				//aggiungo la lettera alla soluzione
				parolaparziale+=c;
				//richiamo la funxione per scendere di livello
				ricorsivoanagrammi(parola,parolaparziale,livello+1);
				//eseguo il backtracking e tolgo la lettera dalla soluzione parziale 
				//per cambiare ramo di ricerca
				parolaparziale=parolaparziale.substring(0, parolaparziale.length()-1);
				
				
			}
		
			
		}
			
		}
	public List<String> anagrammiCorretti(List<String> anagrammi){
		AnagrammaDAO anadao=new AnagrammaDAO();
		List<String> corretti=new ArrayList<String>();
		for(String s:anagrammi) {
			if(anadao.isCorrect(s)==true) {
				corretti.add(s);
			}
				
		}
		
		return corretti;
		
	}
	public List<String> anagrammiErrati(List<String> anagrammi){
		AnagrammaDAO anadao=new AnagrammaDAO();
		List<String> errati=new ArrayList<String>();
		for(String s:anagrammi) {
			if(anadao.isCorrect(s)==false) {
				errati.add(s);
			}
				
		}
		
		return errati;
		
	}
	public String Stampalista(List<String> lista) {
		String res="";
		for(String s:lista)
			res+=s+"\n";
		return res;
		
	}
	
	
	
}
