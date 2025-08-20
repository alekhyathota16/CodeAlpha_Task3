import java.util.Scanner;

// ChatBot class that handles responses
class ChatBot {

    public String getResponse(String input) {
        input = input.toLowerCase();

        if (input.equals("bye")) {
            return "Goodbye! 👋";
        } else if (input.contains("hello") || input.contains("hi")) {
            return "Hello there! How can I assist you today?";
        } else if (input.contains("how are you")) {
            return "I'm just a chatbot, but I'm doing great! Thanks for asking 😊";
        } else if (input.contains("your name")) {
            return "I'm JavaChatBot 🤖, nice to meet you!";
        } else if (input.contains("help")) {
            return "I can respond to greetings, tell you my name, or chat casually. Try asking me something!";
        } else {
            return "Hmm... I didn't quite get that. Could you rephrase?";
        }
    }
}

// Main class to run the chatbot
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatBot bot = new ChatBot();

        System.out.println("🤖 JavaChatBot: Hello! Type 'bye' to exit.");
        
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            String response = bot.getResponse(userInput);
            System.out.println("🤖 ChatBot: " + response);

            if (userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }

        scanner.close();
    }
}
