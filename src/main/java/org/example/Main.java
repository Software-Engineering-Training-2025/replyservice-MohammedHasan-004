package org.example;
import org.example.ReplyService;
import org.example.ReplyType;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(ReplyService().reply("hi", ReplyType.FORMAL));
    }
}