package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word {

    private char[] wordList;

    public Word(){
        this.wordList = generateWord();


    }

    public char[] generateWord(){

        //char array of each
        char[] vowel = {'a','e','i','o','u'};
        char consonant[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'y', 'z', '\0'};

        //vowel
        Random random = new Random();
        int randomIndex = random.nextInt(vowel.length);

        List<Character> newlist = new ArrayList<>();

        newlist.add(vowel[randomIndex]);

        //consonant
        int randomIndexC = random.nextInt(consonant.length);
        newlist.add(consonant[randomIndexC]);

        char[] result = new char[newlist.size()];

        //put in arraylist to char[]
        for(int i=0; i < newlist.size();i++){
            result[i] = newlist.get(i);
        }

//        System.out.println("GENERATED LETTER: " + result[0] + " " + result[1]);

        return result;




    }

}
