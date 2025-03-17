/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softprinciples.LowCoupling.withoutprinciple;

/**
 *
 * @author sayyam
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Java Basics");
        Member member = new Member("Sayyam");

        library.issueBook(book, member);
        library.returnBook(book, member);
    }
}
