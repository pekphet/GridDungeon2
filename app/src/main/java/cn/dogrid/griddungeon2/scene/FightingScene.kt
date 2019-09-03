package cn.dogrid.griddungeon2.scene

import cn.dogrid.griddungeon2.bean.MonsterDO
import cn.dogrid.griddungeon2.bean.SelfInfoDO

class FightingScene {
    fun tap(isFirst: Boolean) {

    }
}

interface IScene {
    fun find(self: SelfInfoDO, monster: MonsterDO)
    fun ready(self: SelfInfoDO, monster: MonsterDO)
    fun before(self: SelfInfoDO, monster: MonsterDO)
    fun after(self: SelfInfoDO, monster: MonsterDO)
    fun onAward()
    fun final(self: SelfInfoDO, monster: MonsterDO)
}

class SimpleScene : IScene {
    override fun find(self: SelfInfoDO, monster: MonsterDO) {
    }

    override fun ready(self: SelfInfoDO, monster: MonsterDO) {
    }

    override fun before(self: SelfInfoDO, monster: MonsterDO) {
    }

    override fun after(self: SelfInfoDO, monster: MonsterDO) {
    }

    override fun onAward() {
    }

    override fun final(self: SelfInfoDO, monster: MonsterDO) {
    }

}