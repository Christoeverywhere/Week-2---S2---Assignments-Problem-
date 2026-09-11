```java
class WordEncoder {

    String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            StringBuilder reversedWord =
                    new StringBuilder(words[i]);

            reversedWord.reverse();

            result.append(reversedWord);

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}

public class P2_WordReversalEncoder {

    public static void main(String[] args) {

        WordEncoder encoder = new WordEncoder();

        String result =
                encoder.reverseEachWord("hello club");

        System.out.println(result);
    }
}
```

**Output:**

```text
olleh bulc
```
