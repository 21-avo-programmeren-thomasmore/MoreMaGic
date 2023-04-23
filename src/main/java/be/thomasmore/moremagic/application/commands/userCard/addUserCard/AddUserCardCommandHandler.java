package be.thomasmore.moremagic.application.commands.userCard.addUserCard;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import org.springframework.stereotype.Component;

@Component
public class AddUserCardCommandHandler implements Command.Handler<AddUserCardCommand, Voidy> {

    @Override
    public Voidy handle(AddUserCardCommand addUserCardCommand) {
        return null;
    }
}
