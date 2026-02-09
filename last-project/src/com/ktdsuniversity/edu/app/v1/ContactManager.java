package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;


public class ContactManager {

	private List<Contact> contactList;
	private Scanner sc;

	public record MenuItem(int no, String label, MenuEnum action) {}
	public record EditMenuItem(int no, String label, Consumer<Contact> action) {}

	public ContactManager() {
		this.contactList = new ArrayList<>();
		this.sc = new Scanner(System.in);
	}
	
	// 1. contactList에 Contact 인스턴스를 추가하는 기능
	// 2. contactList의 모든 연락처 정보를 출력하는 기능
	// 3. contactList에서 전화번호 검색 결과 출력하는 기능
	//   예> 010 파라미터로 전달하면 전화번호에 010이 포함된 연락처의 모든 정보를 출력한다.
	
	// 4. contactList에서 이름 검색결과 출력하는 기능.
	//   예> "김"을 파라미터로 전달하면 name,firstName, lastName, companyName에 "김"이 포함된 연락처의 모든 정보를 출력.
	
	// 5. contactList에서 이메일 검색결과 출력하는 기능.
	//   예> "@abc.com"을 파라미터로 전달하면 이메일에 "@abc.com"이 포함된 연락처의 모든 정보를 출력.
	
	// 6. 연락처 정보 수정 기능
	//   예> 다양한 검색의 결과중 하나를 선택해 연락처 정보를 수정할 수 있는 기능.
	//       이름을 변경, 전화번호 추가, 전화번호 수정, 회사 정보 수정....
	
	// 7. 연락처 정보 삭제 기능
	//   예> 다양한 검색의 결과 중 하나를 선택해서 contactList에서 제거하는 기능.

    public static List<MenuItem> MENUS = List.of(
            new MenuItem(1, "연락처 추가", MenuEnum.ADD),
            new MenuItem(2, "모든 연락처 정보 출력", MenuEnum.ALL_INFO),
            new MenuItem(3, "전화번호 검색", MenuEnum.SEARCH_PHONE),
            new MenuItem(4, "이름 검색", MenuEnum.SEARCH_NAME),
            new MenuItem(5, "이메일 검색", MenuEnum.SEARCH_EMAIL),
            new MenuItem(6, "연락처 수정", MenuEnum.EDIT),
            new MenuItem(7, "연락처 삭제", MenuEnum.DELETE),
            new MenuItem(8, "앱 종료", MenuEnum.END)
    );

    public  List<EditMenuItem> EDIT_MENUS = List.of(
    	    new EditMenuItem(1, "이름(전체)", p -> p.setName(null)),
    	    new EditMenuItem(2, "별명", p -> p.setNickName(null)),
    	    new EditMenuItem(3, "이메일", p -> p.setEmail(null)),
    	    new EditMenuItem(4, "이름", p -> p.setLastName(null)),
    	    new EditMenuItem(5, "성", p -> p.setFirstName(null)),
    	    new EditMenuItem(6, "전화번호", p -> p.setPhones(null)),
    	    new EditMenuItem(7, "회사 정보", p -> p.setCompany(null)),
    	    new EditMenuItem(8, "메모", p -> p.setMemo(null))
    );
    
    public void editFullName() {
    	
    }
	public static void editNickName() {
	    	
	    }
	public static void editEmail() {
		
	}
	public static void editLastName() {
		
	}
	public static void editFirstName() {
		
	}
	public static void editPhone() {
		
	}
	public static void editCompany() {
		
	}
	public static void editMemo() {
		
	}
	
    private List<Phone> inputPhone(Contact contact) {
        Phone.Type type;

        while (true) {
            System.out.println("전화번호 유형을 선택하세요:");
            System.out.println("1. 개인  2. 집  3. 회사");
            System.out.print("선택: (건너뛰기: Enter)");

            String typeInput = sc.nextLine().trim();

            if (typeInput.isEmpty()) {
                System.out.println("전화번호 등록을 하지 않았습니다.\n");
                return null;
            }
            
            int typeNum;
            try {
                typeNum = Integer.parseInt(typeInput);
            } catch (NumberFormatException e) {
                System.out.println("잘못 입력하셨습니다. 1~3 중 하나를 입력해주세요.\n");
                continue;
            }

            switch (typeNum) {
                case 1 -> type = Phone.Type.PERSONAL;
                case 2 -> type = Phone.Type.HOME;
                case 3 -> type = Phone.Type.COMPANY;
                default -> {
                    System.out.println("잘못 입력하셨습니다. 1~3 중 하나를 입력해주세요.\n");
                    continue;
                }
            }
            break;
        }

        System.out.print("전화번호: ");
        String phoneNumber = sc.nextLine().trim();

        Phone p = new Phone(type, phoneNumber); 
        contact.getPhones().add(p);
        
	    
        return contact.getPhones();
    }

	private void addContact() { 
		
		Contact contact = new Contact();
		
		System.out.println("연락처 추가 메뉴입니다. (입력을 건너뛰려면 Enter 키를 누르세요.)");
	    System.out.print("성: ");
	    contact.setFirstName(sc.nextLine().trim());

	    System.out.print("이름: ");
	    contact.setLastName(sc.nextLine().trim());

	    System.out.print("별명: ");
	    contact.setNickName(sc.nextLine().trim());

	    System.out.print("회사명: ");
	    String companyName = sc.nextLine().trim();

	    System.out.print("직급: ");
	    String job = sc.nextLine().trim();

	    System.out.print("회사주소: ");
	    String address = sc.nextLine().trim();

	    if (!companyName.isEmpty() || !job.isEmpty() || !address.isEmpty()) {
	        Company company = new Company();
	        company.setCompanyName(companyName); 
	        company.setJob(job);                 
	        company.setAddress(address);         
	        contact.setCompany(company);         
	    } else {
	        contact.setCompany(null);            
	    }

	    System.out.print("이메일: ");
	    contact.setEmail(sc.nextLine().trim());

	    System.out.print("메모: ");
	    contact.setMemo(sc.nextLine().trim());
		
	    List<Phone> phones = inputPhone(contact);
		
	    while (true) {
	        // 1) 전화번호 추가 여부
	        System.out.print("전화번호를 추가하시겠습니까? (Y/N): ");
	        String addAnswer = sc.nextLine().trim();

	        if (addAnswer.equalsIgnoreCase("Y")) {
	        	phones = inputPhone(contact);
	        }

	        if (addAnswer.equalsIgnoreCase("N")) {
	            // 2) 최종 등록 여부 (등록/취소가 결정될 때까지 반복)
	            while (true) {
	                System.out.print("연락처를 등록하시겠습니까? (Y/N): ");
	                String confirm = sc.nextLine().trim();

	                if (confirm.equalsIgnoreCase("Y")) {
	                	contactList.add(contact);
	                    System.out.println("연락처가 등록되었습니다.\n");
	                    
	                    return; // 등록 완료 -> 메뉴 종료(초기 메뉴로 복귀)
	                }

	                if (confirm.equalsIgnoreCase("N")) {
	                    System.out.println("연락처 등록이 취소되었습니다. 초기 메뉴로 돌아갑니다.\n");
	                    return; // 취소 완료 -> 메뉴 종료(초기 메뉴로 복귀)
	                }

	                System.out.println("잘못 입력하셨습니다. Y/N 중 하나를 입력해주세요.\n");
	            }
	        }
	    }
	}
	private void printAllContacts() { 
		System.out.println("전체 출력 메뉴입니다.");
		for ( Contact contact : contactList) {
		    System.out.println(contact.getNickName()+ ": " + contact.getPhones()+ " ");
		}
	}
	private void searchByPhone() { 
		System.out.println("전화번호 검색 메뉴입니다."); 
		System.out.print("검색할 전화번호를 입력하세요: ");
		String searchPhone = sc.nextLine();
		
		contactList.stream()
				   .filter(contact -> contact.getPhones().stream()
						   								.anyMatch(p -> p.getPhoneNumber().contains(searchPhone)))
				   .forEach(contact -> System.out.println(contact.getNickName() +": " + contact.getPhones() + " "));
	}
	private void searchByName() { 
		System.out.println("이름 검색 메뉴입니다."); 
		System.out.print("검색할 이름을 입력하세요: ");
		String searchName = sc.nextLine();
		
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getNickName().contains(searchName)) {
				System.out.println(contactList.get(i).getNickName()+ ": " + contactList.get(i).getFirstName()+ contactList.get(i).getLastName() + " ");
			}
		}
	}
	private void searchByEmail() { 
		System.out.println("이메일 검색 메뉴입니다."); 
		System.out.print("검색할 이메일을 입력하세요: ");
		String searchEmail = sc.nextLine();
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getEmail().contains(searchEmail)) {
				System.out.println(contactList.get(i).getNickName()+ ": " + contactList.get(i).getEmail()+ " ");
			}
		}
	}
	private void editContact() { 
		System.out.println("연락처 수정 메뉴입니다."); 
		System.out.print("수정하고 싶은 연락처의 이름을 입력하세요: ");
		String searchName = sc.nextLine();
		int chooseNum = 0;
		List<Contact> editList = new ArrayList<>();
		while(true) {
			for(int i = 0; i < contactList.size(); i++) {
				if(contactList.get(i).getNickName().contains(searchName)) {
					editList.add(contactList.get(i));
					System.out.println(editList.size() + ". " + contactList.get(i).getNickName()+ ": " + contactList.get(i).getFirstName()+ contactList.get(i).getLastName() + " ");
				}
			}
			
			System.out.println("수정하고 싶은 연락처를 선택해주세요 :");
			try {
				chooseNum = Integer.parseInt(sc.nextLine());	
			} catch (Exception e) {
				System.out.println("번호를 입력해주세요.");
				continue;
			}
			
			if(chooseNum > editList.size() || chooseNum < 1) {
				System.out.println("올바른 숫자를 입력하세요.");
				continue;
			}
			else {
				break;
			}
		}
		
		while (true) {
			System.out.print(editList.get(chooseNum-1).getNickName() + " : " + editList.get(chooseNum-1).getPhones() + "님의 연락처를 수정하시겠습니까? (y/n)");
	        String confirm = sc.nextLine().trim();

            if (confirm.equalsIgnoreCase("Y")) {
            	
            	// 연락처 수정 메소드 구현
            	// 해당연락처의 정보 다 보여주기
            	System.out.println("이름 : " + editList.get(chooseNum-1).getName());
            	System.out.println("이름 : " + editList.get(chooseNum-1).getName());
        		while(true) {
        			for (MenuItem m : MENUS) {
        			    System.out.print(m.no() + ". " + m.label() + " ");
        			}
        	
        			System.out.print("\n원하는 메뉴를 선택하세요:");
        			int menuNum;
        			try {
        				menuNum = Integer.parseInt(sc.nextLine());				
        			} catch (NumberFormatException nfe) {
        				System.out.println("숫자만 입력 가능합니다.");
        				continue;
        			}

        		}
        		
            }

            if (confirm.equalsIgnoreCase("N")) {
                System.out.println("연락처 수정이 취소되었습니다. 초기 메뉴로 돌아갑니다.\n");
                return; // 취소 완료 -> 메뉴 종료(초기 메뉴로 복귀)
            }

            System.out.println("잘못 입력하셨습니다. Y/N 중 하나를 입력해주세요.\n");
        }
		
		
	}
	private void deleteContact() { 
		System.out.println("연락처 삭제 메뉴입니다."); 
		System.out.print("삭제하고 싶은 연락처의 이름을 입력하세요: ");
		String searchName = sc.nextLine();
		int chooseNum = 0;
		List<Contact> deleteList = new ArrayList<>();
		while(true) {
			for(int i = 0; i < contactList.size(); i++) {
				if(contactList.get(i).getNickName().contains(searchName)) {
					deleteList.add(contactList.get(i));
					System.out.println(deleteList.size()+ ". " + contactList.get(i).getNickName()+ ": " + contactList.get(i).getFirstName()+ contactList.get(i).getLastName() + " ");
				}
			}
			
			System.out.println("삭제하고 싶은 연락처를 선택해주세요 :");
			try {
				chooseNum = Integer.parseInt(sc.nextLine());	
			} catch (Exception e) {
				System.out.println("번호를 입력해주세요.");
				continue;
			}
			
			if(chooseNum > deleteList.size() || chooseNum < 1) {
				System.out.println("올바른 숫자를 입력하세요.");
				continue;
			}
			else {
				break;
			}
		}
		
		while (true) {
			System.out.print(deleteList.get(chooseNum-1).getNickName() + " : " + deleteList.get(chooseNum-1).getPhones() + "님의 연락처를 삭제하시겠습니까? (y/n)");
	        String confirm = sc.nextLine().trim();

            if (confirm.equalsIgnoreCase("Y")) {
            	contactList.remove(deleteList.get(chooseNum-1));
                System.out.println("연락처가 삭제되었습니다.\n");
                return; // 등록 완료 -> 메뉴 종료(초기 메뉴로 복귀)
            }

            if (confirm.equalsIgnoreCase("N")) {
                System.out.println("연락처 삭제가 취소되었습니다. 초기 메뉴로 돌아갑니다.\n");
                return; // 취소 완료 -> 메뉴 종료(초기 메뉴로 복귀)
            }

            System.out.println("잘못 입력하셨습니다. Y/N 중 하나를 입력해주세요.\n");
        }
	}

	public static void main(String[] args) {
		
		ContactManager cm = new ContactManager();
		
		while(true) {
			for (MenuItem m : MENUS) {
			    System.out.print(m.no() + ". " + m.label() + " ");
			}
	
			System.out.print("\n원하는 메뉴를 선택하세요:");
			int menuNum;
			try {
				menuNum = Integer.parseInt(cm.sc.nextLine());				
			} catch (NumberFormatException nfe) {
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
		    switch (menuNum) {
		        case 1 -> cm.addContact();
		        case 2 -> cm.printAllContacts();
		        case 3 -> cm.searchByPhone();
		        case 4 -> cm.searchByName();
		        case 5 -> cm.searchByEmail();
		        case 6 -> cm.editContact();
		        case 7 -> cm.deleteContact();
		        case 8 -> {
		        	System.out.println("프로그램을 종료합니다.");
		        	return;
		        }
		        default -> System.out.println("없는 메뉴입니다. 1~7 중에서 선택해주세요.");
		    }
		}
	}
}
