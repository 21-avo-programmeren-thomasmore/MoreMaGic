package be.thomasmore.moremagic.application.commands.editUser;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class EditUserCommand implements Command<Voidy> {
    public Integer id;
    public String name;
    public String address;
}
