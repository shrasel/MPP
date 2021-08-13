package lab9.part1.prob_1.business;

import java.util.*;

import lab9.part1.prob_1.dataaccess.DataAccess;
import lab9.part1.prob_1.dataaccess.DataAccessFacade;
import lab9.part1.prob_1.business.Book;
import lab9.part1.prob_1.business.LibraryMember;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		System.out.println(allWhoseZipContains3());
		System.out.println(allHavingAtLeastTwoCopies());
		System.out.println(allHavingMultipleAuthors());
	}

	// Returns a list of all ids of LibraryMembers whose zipcode contains the digit
	// 3
	public static List<String> allWhoseZipContains3() {
		DataAccess da = new DataAccessFacade();
		Collection<LibraryMember> members = da.readMemberMap().values();
		List<LibraryMember> mems = new ArrayList<>();
		mems.addAll(members);

		return mems.stream().filter(mlib -> mlib.getAddress().getZip().contains("3"))
				.map(mlib -> mlib.getMemberId())
				.collect(Collectors.toList());
		// implement
		// return null;

	}

	// Returns a list of all isbns of books having at least two copies
	public static List<String> allHavingAtLeastTwoCopies() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		return bs.stream()
				.filter(book -> book.getNumCopies() >= 2)
				.map(book->book.getIsbn()).collect(Collectors.toList());
	}

	// Returns a list of all isbns of Books that have multiple authors
	public static List<String> allHavingMultipleAuthors() {
		DataAccess da = new DataAccessFacade();
		Collection<Book> books = da.readBooksMap().values();
		List<Book> bs = new ArrayList<>();
		bs.addAll(books);
		// implement
		return bs.stream()
				.filter(book -> book.getAuthors().size() > 1)
				.map(book->book.getIsbn()).collect(Collectors.toList());
		// return null;

	}

}
