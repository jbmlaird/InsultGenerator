package bj.fuckoff.insult

/**
 * Created by Josh Laird on 18/05/2017.
 */
interface InsultContract {
    interface View {
        fun displayInsult(insult: String)
    }

    interface Presenter {}
}