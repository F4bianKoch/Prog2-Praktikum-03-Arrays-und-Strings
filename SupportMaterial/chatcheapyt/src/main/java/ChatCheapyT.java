import java.util.Date;
import java.util.Scanner;
import java.lang.StringBuffer;
import java.text.DateFormat;

public class ChatCheapyT{

  private static String handleSilence(String input){
    if (input.isBlank())
      return "Dann sage ich aber auch nichts!";
    else
      return null;
  }

  private static String handleTooLong(String input){
    if (input.length() > 50)
      return "Das ist mir zuviel zu lesen! Bitte kürzen Sie Ihre Anfrage!";
    else
      return null;
  }

  private static String handleExam(String input){
    if (input.equals("Was kommt in der Klausur dran?"))
      return "Die Klausur orientiert sich an den Praktika!";
    else
      return null;
  }

  private static String handleQuestion(String input){
    if (input.endsWith("?"))
      return "Tut mir leid, aber die ChatCheapyT-Server sind gerade ausgelastet! Schließen Sie bitte ein ChatCheapyT-Pro-Abo ab!";
    else 
      return null;
  }

  private static String handleExclamation(String input){
    if (input.contains("!")) {
      if (!input.toLowerCase().contains("bitte"))
        return "Wie ist das Zauberwort?";
      else 
        return "Als Antwort habe ich ein YouTube-Video generiert: https://youtu.be/dQw4w9WgXcQ.";
    } else
      return null;
  }

  private static String handleChatGPT(String input){
    if (input.contains("ChatGPT"))
      return input.replace("ChatGPT", "CheatCheapyT");
    else
      return null;

  }

  private static String handleScream(String input){
    int uppers = 0;
    for (char s : input.toCharArray()) {
      if (Character.isUpperCase(s))
        uppers++;
    }
    if (uppers >= input.length() / 2) 
      return "Bitte schreien Sie mich nicht an!";
    else
      return null;

  }

  private static String handleReverse(String input){
    if (input.toLowerCase().startsWith("umdrehen:")) {
      StringBuffer inputString = new StringBuffer(input.split(":")[1]);
      return inputString.reverse().toString(); 
    } else {
      return null;
    }

  }

  private static String handleAdd(String input){
    if (input.toLowerCase().startsWith("addiere")) {
      try {
        double a = Double.parseDouble(input.split(" ")[1]);
        double b = Double.parseDouble(input.split(" ")[2]);

        return a + " plus " + b + " ist gleich " + (a + b) + "! Take that, ChatGPT!";

      } catch (NumberFormatException e) {
        throw new IllegalArgumentException("Summanten meussen vom Typ double sein!");
      }

    } else
      return null;

  }

  private static String handleTime(String input) {
    if (input.equals("Zeitstempel")) {
      Date date = new Date();
      return date.toString();

    } else
      return null;
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String prompt = null;

    do {

      System.out.print("Prompt: ");
      prompt = input.nextLine(); 

      String answer = handleSilence(prompt);

      if (answer == null)
        answer = handleTooLong(prompt);

      if (answer == null)
        answer = handleExam(prompt);

      if (answer == null)
        answer = handleQuestion(prompt);

      if (answer == null)
        answer = handleExclamation(prompt);

      if (answer == null)
        answer = handleScream(prompt);

      if (answer == null)
        answer = handleReverse(prompt);

      if (answer == null)
        answer = handleAdd(prompt);

      if (answer == null)
        answer = handleChatGPT(prompt);

      if (answer == null)
        answer = handleTime(prompt);

      if (prompt.equalsIgnoreCase("bye"))
        continue;

      if (answer != null)        
        System.out.println("ChatCheapyT: " + answer);
      else
        System.out.println("ChatCheapyT: Ich verstehe Sie leider nicht!");


    } while (!prompt.equalsIgnoreCase("bye"));

    System.out.println("Bye!");

    input.close();
    
  }





}
