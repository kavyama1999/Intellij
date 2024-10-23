////Contact Search
//
//import com.xworkz.databaseforms.dto.ContactDTO;
//import com.xworkz.databaseforms.dto.ContactSearchDTO;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.List;
//
//@PostMapping("/contactSearch")
//public String searchedContactDetails(ContactSearchDTO contactSearchDTO, Model model) {
//    System.out.println("Contact Data:" + contactSearchDTO);
//    System.out.println("searchedContactDetails method in FormsController..");
//
//    List<ContactDTO> list = formService.contactSearch(contactSearchDTO);
//    if (!list.isEmpty()) {
//        System.out.println("ContactSearch success in FormsController:" + contactSearchDTO);
//    } else {
//        System.out.println("ContactSearch is not success in FormsController:" + contactSearchDTO);
//    }
//    model.addAttribute("ContactName", contactSearchDTO.getName());
//    model.addAttribute("listOfContactNames",list);
//    return "ContactSearch";
//}
//
