package ladder;

import ladder.creator.LadderCreator;

public class LadderGame {

    private final LadderCreator ladderCreator;

    public LadderGame(LadderCreator ladderCreator) {
        this.ladderCreator = ladderCreator;
    }

    public void runLadderGame() {
        LadderRunner ladderRunner = new LadderRunner(ladderCreator.getRows());
        ladderRunner.printLadderGameResult();
    }
}
