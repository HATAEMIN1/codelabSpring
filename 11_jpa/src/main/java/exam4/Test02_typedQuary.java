package exam4;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class Test02_typedQuary {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaEx01");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();
            TypedQuery<Member4> query = em.createQuery(
                    "select m from Member4 m order by m.name",Member4.class);
            List<Member4> result = query.getResultList();
            if(result.isEmpty()){
                System.out.println("사용자가 없습니다");
            }else {
                result.forEach(user->
                        System.out.printf("| %s | %s | %tY - %<tm -%<td | \n",user.getEmail(),user.getName(),user.getCreateDate()));
            }



            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
