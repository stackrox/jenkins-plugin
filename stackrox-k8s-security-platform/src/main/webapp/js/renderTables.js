function renderCVETable(tableId, cves) {
    jQuery(document).ready(function () {
      jQuery(tableId).DataTable({
        dom: '<"top"l>rt<"bottom"fip><"clear">',
        retrieve: true,
        bFilter: false,
        order: [[2, 'desc']],
        data: cves,
        columns : [
                    { title: 'CVE ID', mData : function (data, type, dataToSet) {
                                                    return `<a target="_blank" href="${data.link}">${data.id}</a>`;
                                               }
                    },
                    { title: 'CVSS Score', mData : function (data, type, dataToSet) {
                                                    return `<span>${data.cvssScore}</span><br></br><span style="font-size: 10px; font-family Arial"> (Score type: ${data.scoreType})</span>`;
                                               }
                    },
                    { title: 'Package Name', data : 'packageName' },
                    { title: 'Package Version', data : 'packageVersion' },
                    { title: 'Fixable', data : 'fixable' },
                    { title: 'Publish Date', mData : function (data, type, dataToSet) {
                                                    return new Date(data.publishDate);
                                               }
                   },
                ],
        columnDefs: [
                      {
                        targets: [0, 2, 3, 5],
                        render: function (source, type, val) {
                          return `<span style="word-break: break-word;">${source}</span>`;
                        }
                      },
                    ]
      });
    });
}

function renderPolicyViolationTable(tableId, violatedPolicies) {
    jQuery(document).ready(function () {
      jQuery(tableId).DataTable({
        dom: '<"top"l>rt<"bottom"fip><"clear">',
        retrieve: true,
        bFilter: false,
        order: [[3, 'desc']],
        data: violatedPolicies,
        columns : [
                    { title: 'Policy Name', data : 'name' },
                    { title: 'Description', data : 'description' },
                    { title: 'Severity', data : 'severity' },
                    { title: 'Enforced', data : 'enforced' },
                ],
        columnDefs: [
                  {
                    targets: [0, 1],
                    render: function (source, type, val) {
                      return `<span style="word-break: break-word;">${source}</span>`;
                    }
                  },
                  {
                    targets: 3,
                    render: function (source, type, val) {
                      return source === true ? 'yes' : 'no'
                    }
                  }
                ]
      });
    });
}
