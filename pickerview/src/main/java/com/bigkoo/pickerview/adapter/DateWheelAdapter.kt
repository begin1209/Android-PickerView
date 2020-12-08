package com.bigkoo.pickerview.adapter

import com.bigkoo.pickerview.bean.DateBean
import com.bigkoo.pickerview.bean.DateType
import com.contrarywind.adapter.WheelAdapter

/**
 * @Author zhouy
 * @Date 2020-12-08
 */
class DateWheelAdapter(minValue: Int, maxValue: Int, dateType: DateType) :
        WheelAdapter<DateBean> {
    private var dateList = arrayListOf<DateBean>()

    init {
        for (i in minValue..maxValue) {
            dateList.add(DateBean(dateType, i))
        }
    }

    override fun getItem(index: Int): DateBean {
        return dateList[index]
    }

    override fun getItemsCount(): Int {
        return dateList.size
    }

    override fun indexOf(bean: DateBean): Int {
        return dateList.indexOf(bean)
    }
}