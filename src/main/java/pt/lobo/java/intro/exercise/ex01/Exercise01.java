package pt.lobo.java.intro.exercise.ex01;

public class Exercise01 {

	/**
	 * #1 Crie (neste package) uma classe com o nome StringUtils
	 */
	public static void main(String[] args) {
		
		String name = "Manuel António Homem";
		/**
		 * #2 Implemente na classe StringUtils o método 'static' "getNames(String)" que devolva um array com 2
		 *    elementos contendo o primeiro e último nomes na string 'name' em cima. Guarde o resultado na variável names.
		 *    hint: use o método String.split(...)
		 */
		
		/**
		 * #3 Envie o primeiro e último nomes para a consola, no seguinte formato:
		 *    Primeiro: {primeiro}, Último: {ultimo} 
		 */
		
		/**
		 * #4 Crie a classe "Contact" com os atributos:
		 *    - id (int)
		 *    - firstName (String)
		 *    - lastName (String)
		 *    Crie o construtor, getters e setters necessários para manipular os atributos da classe.
		 *    #4.1 Faça o override do método toString() de maneira que quanto uma instância desta classe
		 *         é enviada para a consola, apareça o texto:
		 *         Contact({firstName} {lastName})
		 *    #4.2 Faça o override dos métodos hashCode/equals de forma que cada instância seja 'distinguida'
		 *         pelo seu id.
		 *         hint: No eclipse - Source > Generate hashCode() and equals() 
		 *  
		 * #5 Crie a classe "AddressBook" contendo os atributos
		 *    - contactList (List<Contact> - colleção com o tipo Contact)
		 *    #5.1 Crie os métodos (non-static):
		 *         - addContact(Contact) - adiciona um contacto à lista de contactos
		 *         - removeContact(Contact) - remove o contacto da lista de contactos
		 *         - getContactList() - devolve a lista de contactos
		 *    #5.2 Crie o método find(String) que procura na lista de contactos um contacto contendo, no primeiro
		 *         ou no último nome, a string passada.
		 *         hint: http://docs.oracle.com/javase/tutorial/java/data/manipstrings.html (procurar por contains)
		 *    #5.3 Crie o método get(int) que devolve um contacto pelo seu ID. Se achar necessário, crie um Map<int, Contact>
		 *         adicional para armazenar contactos pelo seu id.
		 *         hint: atualizar o Map<int,Contact> na altura de adicionar/remover contactos
		 *    #5.4 Demonstre o funcionamento das classes criando alguns contactos, adicionando-os e tentando fazer uma pesquisa
		 *         e get pelo ID.
		 */
		
	}
	
}
