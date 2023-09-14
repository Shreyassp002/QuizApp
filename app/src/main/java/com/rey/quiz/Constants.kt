package com.rey.quiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        //1
        val que1 = Question(
            1,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_india,
            "India", "New Zealand", "Armenia", "Austria",
            1
        )
        questionsList.add(que1)

        //2
        val que2 = Question(
            2,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_belgium,
            "Denmark", "Belgium", "India", "Brazil",
            2
        )
        questionsList.add(que2)

        //3
        val que3 = Question(
            3,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Brazil", "Armenia", "Austria",
            2
        )
        questionsList.add(que3)

        //4
        val que4 = Question(
            4,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia", "Armenia", "Austria",
            2
        )
        questionsList.add(que4)

        //5
        val que5 = Question(
            5,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina", "Australia", "Armenia", "Denmark",
            4
        )
        questionsList.add(que5)

        //6
        val que6 = Question(
            6,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina", "Australia", "Fiji", "Austria",
            3
        )
        questionsList.add(que6)


        //7
        val que7 = Question(
            7,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Australia", "Armenia", "Austria",
            1
        )
        questionsList.add(que7)


        //8
        val que8 = Question(
            8,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        questionsList.add(que8)


        //9
        val que9 = Question(
            9,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina", "New Zealand", "Armenia", "Austria",
            2
        )
        questionsList.add(que9)


        return questionsList

    }
}