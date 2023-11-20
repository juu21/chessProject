package Chess;

import Boardgame.BoardException;

public class ChessException extends BoardException {

    public ChessException(String msg) {
        super(msg);          // para repassar para o construtor essa menssagem
    }
}
