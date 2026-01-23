package com.ktdsuniversity.edu.article.management;

import com.ktdsuniversity.edu.member.management.Member;

//데이터클래스
public class Article {
	
	String title;
//  Member 클래스에서 import 해올 것
//	String authorName;
//	String authorId;
	Member author;
	String content;
	
	//생성자
	public Article(String title, Member author, String content) {
		this.title = title;
		this.author = author;
		this.content = content;
	}
	
	public void viewArticleDescription() {
		System.out.println("제목 : " + this.title);
		System.out.println("내용 : " + this.content);
		
		//접근제어자를 private으로 설정한 경우 해당 클래스에서 메소드(public)를 만들어 출력하도록 한다.
		this.author.printInfo();
		
		// member와 author의 패키지가 다르므로 문제 발생 
		// -> 접근제어지시자(public)로 접근 범위를 풀어줘야함. -> 보안에 문제 발생
		// -> getter/setter 메소드(public)을 불러온다.
		System.out.println("작성자ID: " + this.author.getId());
		System.out.println("작성자명: " + this.author.getName());
		
	}
	public static void main(String[] args) {

		Member author = new Member("superuser", "관리자");
		
		Article article = new Article("테스트", author , "내용");
		
		article.viewArticleDescription();
	}
}
