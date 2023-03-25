package be.thomasmore.moremagic.application.queries.getUsers;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.User;
import be.thomasmore.moremagic.persistence.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetUsersQueryHandler implements Command.Handler<GetUsersQuery, List<User>> {

    private final UserRepository _userRepository;
    public GetUsersQueryHandler(UserRepository userRepository) {

        _userRepository = userRepository;
    }

    @Override
    public List<User> handle(GetUsersQuery getUserQuery) {
        return _userRepository.findAll();
    }
}
