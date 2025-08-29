package org.example;
/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService{

    public String reply(String message, ReplyType type) {
        if (message.equals("hi")){
            if (type==ReplyType.FORMAL){
                return "Hello. How can I assist you today?";
            }
            else if (type==ReplyType.FRIENDLY){
                return "Hey there! 😊 How can I help?";
            }
            else if (type==ReplyType.CONCISE){
                return "Hello. How can I help?";
            }
        }
        else if (message.equals("hello")){
            if (type==ReplyType.FORMAL){
                return "Hello. How can I assist you today?";
            }
            else if (type==ReplyType.FRIENDLY){
                return "Hi! 👋 What’s up?";
            }
            else if (type==ReplyType.CONCISE){
                return "Hello. How can I help?";
            }
        }
        else if (message.equals("how are you")){
            if (type==ReplyType.FORMAL){
                return "I am functioning properly. How may I assist you?";
            }
            else if (type==ReplyType.FRIENDLY){
                return "Doing great! 😄 How can I help?";
            }
            else if (type==ReplyType.CONCISE){
                return "I’m good. How can I help?";
            }
        }
        else if(message.equals("i need help")){
            if (type==ReplyType.FORMAL){
                return "I can assist with that. Please provide more details.";
            }
            else if (type==ReplyType.FRIENDLY){
                return "I’ve got you! 🙂 Tell me a bit more.";
            }
            else if (type==ReplyType.CONCISE){
                return "Share details; I’ll help.";
            }
        }
        else if (message.equals("can you help me with my account")){
            if (type==ReplyType.FORMAL){
                return "Certainly. Please describe the account issue.";
            }
            else if (type==ReplyType.FRIENDLY){
                return "Sure thing! 😊 What’s wrong with the account?";
            }
            else if (type==ReplyType.CONCISE){
                return "Describe the account issue…";
            }
        }
        else if (message.equals("thanks")){
            if (type==ReplyType.FORMAL){
                return "You are welcome.";
            }
            else if (type==ReplyType.FRIENDLY){
                return "Anytime! 🙌";
            }
            else if (type==ReplyType.CONCISE){
                return "You’re welcome.";
            }
        }
        else if (message.equals("bye")){
            if (type==ReplyType.FORMAL){
                return "Goodbye.";
            }
            else if (type==ReplyType.FRIENDLY){
                return "See you later! 👋";
            }
            else if (type==ReplyType.CONCISE){
                return "Goodbye.";
            }
        }
        else if (message.equals("what is your name")){
            if (type==ReplyType.FORMAL){
                return "I am your virtual assistant.";
            }
            else if (type==ReplyType.FRIENDLY){
                return "I’m your helper bot 🤖";
            }
            else if (type==ReplyType.CONCISE){
                return "I’m your assistant.";
            }
        }
        else if (message.trim().isEmpty())
        {
            return "Please say something.";
        }
        else{
            if (type==ReplyType.FORMAL){
                return "Could you clarify your request?";
            }
            else if (type==ReplyType.FRIENDLY){
                return "Could you tell me more?";
            }
            else if (type==ReplyType.CONCISE){
                return "Please clarify.";
            }
            return "this message not found and not in any type";
        }
        return "this message not found and not in any type";


        // Requirements:
        // - null or blank -> "Please say something."
        // - For known messages, return exact string for each ReplyType.
        // - For unknown messages, return the 'any other text' mapping.
//        throw new UnsupportedOperationException("Not implemented yet");
    }
}
