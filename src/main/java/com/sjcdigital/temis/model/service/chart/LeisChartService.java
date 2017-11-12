/**
 * 
 */
package com.sjcdigital.temis.model.service.chart;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.sjcdigital.temis.model.dto.chart.LeisChart;
import com.sjcdigital.temis.model.repositories.impl.Leis;

/**
 * @author pesilva
 *
 */

@Stateless
public class LeisChartService {
	
	@Inject
	private Leis leis;
	
	public LeisChart montaLeisChartPorAutor(final Long id) {
		return new LeisChart(leis.contaLeisPorTipoEAutor(id), leis.contaLeisPorSituacaoEAutor(id), leis.contaLeisPorClasseEAutor(id));
	}
	
	public LeisChart montaLeisChart() {
		return new LeisChart(leis.contaLeisPorTipo(), leis.contaLeisPorSituacao(), leis.contaLeisPorClasse());
	}

}
