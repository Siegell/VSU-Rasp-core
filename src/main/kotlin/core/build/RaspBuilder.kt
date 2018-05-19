package core

import core.rasp.Lesson
import core.rasp.Schedule

class RaspBuilder() {
    fun buildScheduleByGroup(oldSchedule: Schedule, group: String, subGroup: String): Schedule {
        var tempSerial = oldSchedule.serial
        var tempFaculty = oldSchedule.faculty
        var tempEducationForm = oldSchedule.education_form
        var tempWeekNumber = oldSchedule.week_number
        var tempLessons: List<Lesson> = new List<Lesson>
        for (i in oldSchedule.pairs_list) {
            if (i.group == group && i.sub_group == subGroup) {
                tempLessons.plus(i)
            }
        }
        return oldSchedule
    }
}