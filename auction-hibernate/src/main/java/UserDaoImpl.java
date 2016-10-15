import com.skillsup.auction.dao.api.UserDao;
import com.skillsup.auction.domain.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

/**
 * Created by swanta on 15.10.16.
 */

@org.springframework.stereotype.Repository("userDao")
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Collection<User> getAll() {
        return null;
    }

    @Override
    public User getUser(String login) {
        return em.find(User.class, new User(login, "", ""));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void add(User entity) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(User entity) {

    }
}
