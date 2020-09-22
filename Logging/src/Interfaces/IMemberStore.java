package Interfaces;

import DBhelpers.Member;

public interface IMemberStore {




     /**
     * create a member, add in database and in array.
     *
     * @param member
     */
    Member createMember(Member member);

    /**
     * Get a specific member from database using an Member id.
     *
     * @param memberId
     * @return Member.
     */
    Member getMember(int memberId);


    /**
     * delete a specific member from database using an Member id.
     *
     * @param memberId
     */
    void deleteMember(int memberId);

    /**
     * create a suspension an connect with a Member.
     *
     * @param memberId
     */

    void createSuspension(int memberId);

    /**
     * check if memver exist, helping method for creating members;
     *
     */
    void checkPersonNr();




}
