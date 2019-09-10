package Trabalho;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author ktia-
 */
public class GeradorId {

    private static int id = 1;

    public static int getNextId() throws UnsupportedEncodingException, IOException {
        BuscaID check = new BuscaID();

        if (!check.pesquisa(id)) {
            return id++;
        } else {
            id++;
            return getNextId();

        }
    }
}
