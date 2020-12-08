package com.bigkoo.pickerview.bean

import com.bigkoo.pickerview.utils.MonthUtils
import com.contrarywind.interfaces.IPickerViewData

/**
 * @Author zhouy
 * @Date 2020-12-08
 */
class DateBean(var type: DateType, var current: Int): IPickerViewData {



    override fun getPickerViewText(): String {
        return when(type) {
            DateType.MONTH -> MonthUtils.getMonth(current)
            else -> current.toString()
        }
    }
}