/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softprinciples.LowCoupling.Withprinciple;

/**
 *
 * @author sayyam
 */
public class Library {
    private IssueManager issueManager;

    public Library() {
        this.issueManager = new IssueManager();
    }

    public void borrowBook(Book book, Member member) {
        issueManager.issueBook(book, member);
    }

    public void returnBook(Book book, Member member) {
        issueManager.returnBook(book, member);
    }
}
