package com.ktdsuniversity.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class FileReadExam {
	
	/**
	 * NIO
	 * Java version >= 1.8
	 */
	public static void readAndPrintFileDescriptionUseIO(String parentPath, String file) {
		
		// 1. 읽으려는 파일을 특정.
		File target = new File(parentPath, file);
		
		// 2. 파일이 존재하는지 확인.
		
		// 3. 읽으려는 대상이 진짜 파일이 맞는지 확인.
		if(target.exists() && target.isFile()) {
			// 4. 파일의 내용을 읽기 시작.
			// 4-1. 파일의 바이트를 Chunking해서 가져온다.
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			try {
				fileReader = new FileReader(target);
				// 4-2. 파일의 내용을 String으로 변환한다.
				bufferedReader = new BufferedReader(fileReader);
				
				// 한줄씩 읽어올 내용들
				String line = null;
				while(true) {
					// file이 끝나는 지점(EndofFile -eof)까지 반복해라.-> while
						line = bufferedReader.readLine();
					// eof까지 갔느냐 
					if(line == null) {
						// 열린순서의 역순으로 pipe해제
						bufferedReader.close(); 
						fileReader.close();
						break;
					}
					else {
						// 4-3. 내용을 출력한다.
						System.out.println(line);
					}
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				//bufferedReader가 열려있으면
				if(bufferedReader != null) {
					//닫기
					try {
						bufferedReader.close();
					} catch (IOException e) {}
				}
				//fileReader가 열려있으면
				if(fileReader != null) {
					//닫기
					try {
						fileReader.close();
					} catch (IOException e) {}
				}
			}
			
		}
	}
	
	public static void readAndPrintFileDescriptionUseIOAutoClose(String parentPath, String file) {
		
		// 1. 읽으려는 파일을 특정.
		File target = new File(parentPath, file);
		
		// 2. 파일이 존재하는지 확인.
		
		// 3. 읽으려는 대상이 진짜 파일이 맞는지 확인.
		if(target.exists() && target.isFile()) {
			// 4. 파일의 내용을 읽기 시작.
			// 4-1. 파일의 바이트를 Chunking해서 가져온다.
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			try {
				fileReader = new FileReader(target);
				// 4-2. 파일의 내용을 String으로 변환한다.
				bufferedReader = new BufferedReader(fileReader);
				
				// 한줄씩 읽어올 내용들
				String line = null;
				while(true) {
					// file이 끝나는 지점(EndofFile -eof)까지 반복해라.-> while
						line = bufferedReader.readLine();
					// eof까지 갔느냐 
					if(line == null) {
						// 열린순서의 역순으로 pipe해제
						bufferedReader.close(); 
						fileReader.close();
						break;
					}
					else {
						// 4-3. 내용을 출력한다.
						System.out.println(line);
					}
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				//bufferedReader가 열려있으면
				if(bufferedReader != null) {
					//닫기
					try {
						bufferedReader.close();
					} catch (IOException e) {}
				}
				//fileReader가 열려있으면
				if(fileReader != null) {
					//닫기
					try {
						fileReader.close();
					} catch (IOException e) {}
				}
			}
			
		}
	}
	
	/**
	 * IO
	 * Java version >= 1.8
	 */
	public static void readAndPrintFileDescriptionUseNIO(String parentPath, String file) {
		// 1. 읽으려는 파일을 특정
		File target = new File(parentPath, file);
		System.out.println("parentPath" + parentPath);
		// 2. 파일의 내용을 읽는다.
		// 3. 파일의 내용을 List에 할당한다.
		try {
			Files.lines(target.toPath());
			List<String> lines = Files.readAllLines(target.toPath());

			// 4. 파일의 내용을 출력한다.
			for(String line: lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		// 운영체제의 정보를 취득
		Properties props = System.getProperties();
		String homePath = props.get("user.home").toString();
		System.out.println("homePath" + homePath);
//		System.out.println(props);
//		System.out.println(props.get("user.home"));
//		Map<String, String> env = System.getenv();
//		System.out.println(env.get("HOME"));
		
		// C:\Java Exam  폴더의 정보를 추출.
		// java.io.File
		System.out.println(File.separator);
		File directory = new File(homePath + File.separator + "/Java Exam");
		// 1. 폴더의 이름 출력.
		String directoryName = directory.getName();
		System.out.println(directoryName);
		// 2. 이 경로가 가리키는 것이 파일인지 폴더인지를 구분.
		boolean isFile = directory.isFile();
		// isFile의 값이 true이면 파일이다. false이면 파일이 아니다.
		System.out.println(isFile);
		
		boolean isDirectory = directory.isDirectory();
		// isDirectory가 true이면 폴더다. false이면 폴더가 아니다.
		System.out.println(isDirectory);
		// 3. 이 경로가 실제 존재하는 것인지.
		boolean exists = directory.exists();
		// exists가 true이면 존재하는 폴더, false이면 존재하지 않는 폴더
		System.out.println(exists);
		// 4. 이 경로의 크기(폴더의 크기) 출력.
		long bytes = directory.length();
		System.out.println(bytes + " byte");
		
		// C:\Java Exam\Java Exam.txt 파일의 정보를 추출.
		File textFile = new File(homePath + File.separator + "Java Exam", "Java Exam.txt");
		// 1. 파일의 이름을 출력
		System.out.println(textFile);
		// 2. 파일이 폴더인지 파일인지 구분해서 출력
		isDirectory = textFile.isDirectory();
		isFile = textFile.isFile();
		// 3. 이 파일이 실제 존재하는 것인지 출력
		boolean isexists= textFile.exists();
		// 4. 파일의 크기를 출력한다.
		bytes = textFile.length();
		// 5. 이 파일이 있는 부모의 경로를 출력.
		//		- 첫 번째 방법
		String parentPath = textFile.getParent();
		System.out.println(parentPath);
		//		- 두 번째 방법
		File parentFile = textFile.getParentFile();
		System.out.println(parentFile);
		// 6. 이 파일의 경로를 출력한다.
		String textFilePath = textFile.getAbsolutePath();
		System.out.println(textFilePath);
		
//		readAndPrintFileDescriptionUseNIO(homePath + File.separator + "Java Exam" , "Java Exam.txt"); 			
		readAndPrintFileDescriptionUseIO(homePath + File.separator + "Java Exam" , "Java Exam.txt"); 			
		
		
	}
}
