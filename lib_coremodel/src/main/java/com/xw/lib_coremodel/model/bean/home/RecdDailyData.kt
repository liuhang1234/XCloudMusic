package com.xw.lib_coremodel.model.bean.home

import com.xw.lib_coremodel.model.bean.BaseHttpResponse

/**
 * @author: xingwei
 * @email: 654206017@qq.com
 *
 * Desc:
 */
data class RecdDailyData(val recommend: List<SongInfo>) : BaseHttpResponse()