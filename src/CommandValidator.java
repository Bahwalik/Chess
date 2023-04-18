/*
 * B - Король
 * F - Ферзь
 * L - Ладья
 * S - Слон
 * K - Конь
 * для пешки в начале буквы пожалели
 */
public class CommandValidator {
    public boolean validate(String line){
        return line.matches("^[LBSKF]?[A-H][1-8]-[LBSKF]?[A-H][1-8]$");
    }
}