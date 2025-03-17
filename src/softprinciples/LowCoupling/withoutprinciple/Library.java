/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softprinciples.LowCoupling.withoutprinciple;

/**
 *
 * @author sayyam
 */
public class Library {
    public void issueBook(Book book, Member member) {
        System.out.println(member.name + " borrowed " + book.title);
    }

    public void returnBook(Book book, Member member) {
        System.out.println(member.name + " returned " + book.title);
    }
}
