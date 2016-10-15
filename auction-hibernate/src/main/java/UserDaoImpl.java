import com.skillsup.auction.dao.api.UserDao;
import com.skillsup.auction.domain.User;
import org.springframework.transaction.annotation.Propagation;

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
        return null;
    }

    @Override
    @org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQIRED)
    public void add(User entity) {

    }

    @Override
    public void remove(User entity) {

    }
}
