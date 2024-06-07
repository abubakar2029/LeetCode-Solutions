public class _744_FindSmallestLetterGreaterThan {
    public char nextGreatestLetter(char[] letters, char target) {
        char[] lettersArray = {'c', 'f', 'j'};
        char targetChar = 'a';

        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (start + end) / 2;
            if (lettersArray[mid] > target) end = mid - 1;
            else if (letters[mid] < target) start = mid + 1;
        }
        return letters[mid] > target ? letters[mid] : letters[0];
    }
}
