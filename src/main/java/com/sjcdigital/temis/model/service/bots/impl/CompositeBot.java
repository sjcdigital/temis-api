package com.sjcdigital.temis.model.service.bots.impl;

import com.sjcdigital.temis.model.exceptions.BotException;
import com.sjcdigital.temis.model.service.bots.Bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Rafael Peretta
 *
 * Classe utilizada para agrupar os bots e executá-los.
 */
@Component
public class CompositeBot implements Bot {

    @Autowired
    private List<Bot> bots;

    @Override
    public void saveData() throws BotException {
        for (Bot bot : bots) {
            bot.saveData();
        }
    }
}
