package hu.helixlab;

import hu.helixlab.domain.Contact;
import hu.helixlab.domain.Note;
import hu.helixlab.domain.User;
import hu.helixlab.service.NoteService;
import hu.helixlab.service.UserService;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserService();
		NoteService noteService = new NoteService();


		for (int i =0; i<10; i++) {
			User user = new User();
			user.setEmail("aaa"+ i+"@aa.hu");
			userService.save(user);
		}

	/*	for (User u:userService.findAll()) {
			System.out.println(u.toString());
		}
*/
		//System.out.println(userService.findById(2));


		User user = userService.findById(2);

		Note note = new Note();
		note.setText("megjegyzés");
		noteService.save(note);
		user.setNote(note);

		System.out.println(note.toString());
		System.out.println(user.toString());
	}
}
