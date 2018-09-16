package Mediator;

/**
 * Created by Firas on 9/15/2018.
 */
public class ToggleAllLightsCommand implements Command {

    private Mediator mediator;

    public ToggleAllLightsCommand(Mediator switchLightMediator) {
        this.mediator = switchLightMediator;
    }

    @Override
    public void execute() {
        this.mediator.handle();
    }
}
